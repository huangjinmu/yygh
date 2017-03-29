package com.jim.yygh.controller;


import com.jim.yygh.entity.po.Ksxx;
import com.jim.yygh.entity.vo.KsxxCustom;
import com.jim.yygh.process.result.DataGridResultInfo;
import com.jim.yygh.service.IKsxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by jim on 2017/3/27.
 */
@Controller
@RequestMapping(value = "/ksxxController")
public class KsxxController {
    @Autowired
    private  IKsxxService ksxxService;

    @RequestMapping(value = "/ksxx")
    public String kexx(){
        return "/client/department";
    }

    @RequestMapping(value = "/findAllKsxx")
    @ResponseBody
    public DataGridResultInfo findAllKsxx(HttpServletRequest request, HttpServletResponse response){
        List<KsxxCustom> ksxxList = ksxxService.findAllKsxx(0);
        DataGridResultInfo dataGridResultInfo=new DataGridResultInfo();
        dataGridResultInfo.setRows(ksxxList);

        return dataGridResultInfo;
    }




}
