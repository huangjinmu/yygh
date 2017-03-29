package com.jim.yygh.service.impl;

import com.jim.yygh.dao.KsxxMapper;
import com.jim.yygh.dao.KsxxMapperCustom;
import com.jim.yygh.entity.po.Ksxx;
import com.jim.yygh.entity.po.KsxxExample;
import com.jim.yygh.entity.vo.KsxxCustom;
import com.jim.yygh.entity.vo.KsxxQueryVo;
import com.jim.yygh.service.IKsxxService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by jim on 2017/3/22.
 */

@Service
public class KsxxServiceImpl implements IKsxxService {
    @Autowired
    private KsxxMapper ksxxMapper;
    @Autowired
   private KsxxMapperCustom ksxxMapperCustom;


    public int addKsxx(Ksxx ksxx) {

        int insert=0;
            if (ksxx!=null){
                 String ksName = ksxx.getKsName();
                if (StringUtils.isNotBlank(ksName)){
                    insert=ksxxMapper.insert(ksxx);
                }
            }
        return insert;
    }


    public void deleteKsxxById(Integer id) {

            ksxxMapper.deleteByPrimaryKey(id);

    }

    public void  deleteKsxxByName(String name) {
        int i=0;
        if (StringUtils.isNotBlank(name)){
            KsxxExample example=new KsxxExample();
            KsxxExample.Criteria criteria=example.createCriteria();
            criteria.andKsNameEqualTo(name);
              ksxxMapper.deleteByExample(example);

        }

    }

    public void deleteKsxx(Ksxx ksxx) {

    }



    public List<KsxxCustom> findAllKsxx(int pid) {

        List<KsxxCustom> allKsxx = ksxxMapperCustom.findAllKsxx(pid);
        return allKsxx;
    }

    public List<KsxxCustom> findKsxxList(KsxxQueryVo ksxxQueryVo) throws Exception {
        List<KsxxCustom> ksxxList=null;
        if (ksxxQueryVo!=null){
                ksxxList = ksxxMapperCustom.findKsxxList(ksxxQueryVo);
        }
        return ksxxList;
    }

    public int findKsxxCount(KsxxQueryVo ksxxQueryVo) throws Exception {
        int ksxxCount =0;
        if(ksxxQueryVo!=null){
            if (ksxxQueryVo.getPageQuery()!=null){
                ksxxCount = ksxxMapperCustom.findKsxxCount(ksxxQueryVo);
            }
        }
        return ksxxCount;
    }

    public int updateKsxxById(Ksxx ksxx) {
        int i=0;
        if (ksxx != null) {

                i = ksxxMapper.updateByPrimaryKey(ksxx);

        }

        return i;
    }


    public Ksxx findKsxxById(Integer id){
        Ksxx ksxx=null;
        if (id!=null) {
            ksxx = ksxxMapper.selectByPrimaryKey(id);
        }
        return ksxx;
    }


    public List<Ksxx> findKsxxByKsName(String name){
        List<Ksxx> ksxxes=null;
        if (StringUtils.isNotBlank(name)){
            KsxxExample example=new KsxxExample();
            KsxxExample.Criteria criteria=example.createCriteria();
            criteria.andKsNameEqualTo(name);
             ksxxes = ksxxMapper.selectByExample(example);

        }
        return ksxxes;
    }
}
