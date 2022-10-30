package cn.bugstack.springframework.jdbc.core;

import cn.hutool.core.lang.Assert;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 小傅哥，微信：fustack
 * @description 行转列
 * @date 2022/3/16
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class RowMapperResultSetExtractor<T> implements ResultSetExtractor<List<T>> {

    private final RowMapper<T> rowMapper;

    private final int rowsExpected;

    /**
     * Create a new RowMapperResultSetExtractor.
     * @param rowMapper the RowMapper which creates an object for each row
     */
    public RowMapperResultSetExtractor(RowMapper<T> rowMapper) {
        this(rowMapper, 0);
    }

    public RowMapperResultSetExtractor(RowMapper<T> rowMapper, int rowsExpected) {
        Assert.notNull(rowMapper, "RowMapper is required");
        this.rowMapper = rowMapper;
        this.rowsExpected = rowsExpected;
    }

    @Override
    public List<T> extractData(ResultSet rs) throws SQLException {
        List<T> results = this.rowsExpected > 0 ? new ArrayList<>(this.rowsExpected) : new ArrayList<>();
        int rowNum = 0;
        while (rs.next()) {
            results.add(this.rowMapper.mapRow(rs, rowNum++));
        }
        return results;
    }

}
