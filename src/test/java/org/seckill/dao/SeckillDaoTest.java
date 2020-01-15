package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.seckill.entity.Seckill;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * 配置spring 与 junit 启动时加载Spring IOC容器
 * spring-test,junit整合
 * 告诉junit Spring配置文件位置
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
@MapperScan("org.seckill.dao")
public class SeckillDaoTest {
    //注入Dao类实现
    @Resource
    private SeckillDao seckillDao;

    @Test
    public void queryById() throws Exception {
        long id = 1000;
        Seckill seckill = seckillDao.queryById(id);
        System.out.println(seckill.getName());
        System.out.println(seckill);
        /**
         * 1000元秒杀iphone x
         SecKill{seckillId=1000, name='1000元秒杀iphone x', stock=100, startTime=Fri May 04 00:00:00 CST 2018,
         endTime=Sat May 05 00:00:00 CST 2018, createTime=Sat May 05 00:05:03 CST 2018
         }
         */
    }

    @Test
    public void testQueryAll() throws Exception{
        //报错：List<Seckill> queryAll(int offset,int limit);
        //java没有保存形参的记录
        List<Seckill> seckills = seckillDao.queryAll(0,100);
        for(Seckill seckill : seckills){
            System.out.println(seckill);
        }
    }

    @Test
    public void testReduceNumber() throws Exception{
        Date killTime = new Date();
        int updateCount = seckillDao.reduceNumber(1000L,killTime);
        System.out.println("updateCount:"+updateCount);
    }
}