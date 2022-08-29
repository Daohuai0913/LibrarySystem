package com.library.service;

import com.library.bean.ReaderInfo;
import com.library.bean.Tage;
import com.library.dao.TageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author huai
 * @date 2022/8/30
 */
@Service
public class TageService {

    @Autowired
    private TageDao tageDao;

    public ArrayList<Tage> tages() {
        return tageDao.getAllTages();
    }

    public boolean deleteTage(int tagId) {
        return tageDao.deleteTage(tagId) > 0;
    }

    public Tage getTage(int tagId) {
        return tageDao.getTage(tagId);
    }


    public boolean editTage(Tage tage) {
        return tageDao.editTage(tage) > 0;
    }

    public long addTage(Tage tage) {
        return tageDao.addTage(tage);
    }

}
