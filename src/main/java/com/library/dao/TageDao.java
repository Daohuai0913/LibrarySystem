package com.library.dao;

import com.library.bean.Tage;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author huai
 * @date 2022/8/30
 */
@Repository
public class TageDao {

    private final static String NAMESPACE = "com.library.dao.TageDao.";


    @Resource
    private SqlSessionTemplate sqlSessionTemplate;

    public int matchTage(final String searchWord) {
        String search = "%" + searchWord + "%";
        return sqlSessionTemplate.selectOne(NAMESPACE + "matchTage", search);
    }

    public ArrayList<Tage> queryTage(final String searchWord) {
        String search = "%" + searchWord + "%";
        List<Tage> result = sqlSessionTemplate.selectList(NAMESPACE + "queryTage", search);
        return (ArrayList<Tage>) result;
    }

    public ArrayList<Tage> getAllTages() {
        List<Tage> result = sqlSessionTemplate.selectList(NAMESPACE + "getAllTages");
        return (ArrayList<Tage>) result;
    }

    public int addTage(final Tage tage) {
        return sqlSessionTemplate.insert(NAMESPACE + "addTage", tage);
    }

    public Tage getTage(final long tageId) {
        return sqlSessionTemplate.selectOne(NAMESPACE + "getTage", tageId);
    }

    public int editTage(final Tage tage) {
        return sqlSessionTemplate.update(NAMESPACE + "editTage", tage);
    }

    public int deleteTage(final long tageId) {
        return sqlSessionTemplate.delete(NAMESPACE + "deleteTage", tageId);
    }
}

