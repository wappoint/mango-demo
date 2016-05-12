/**
 * 
 */
package com.mangodemo;

import javax.sql.DataSource;

import org.jfaster.mango.datasource.DriverManagerDataSource;
import org.jfaster.mango.operator.Mango;
import org.testng.annotations.BeforeClass;

/**
 * @author jiazhang
 *
 */
public class BaseTest {
    private static final String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
    private static final String URL               = "jdbc:mysql://localhost:3306/mango_example";
    private static final String USERNAME          = "root";
    private static final String PASSWORD          = "123456";

    public Mango                mango;

    @BeforeClass
    public void before() {
        DataSource ds = new DriverManagerDataSource(DRIVER_CLASS_NAME, URL, USERNAME, PASSWORD);
        mango = Mango.newInstance(ds); // 使用数据源初始化mango
    }
}
