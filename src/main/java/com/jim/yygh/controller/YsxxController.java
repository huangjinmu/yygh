package com.jim.yygh.controller;

import com.jim.yygh.entity.vo.YsxxCustom;
import com.jim.yygh.process.result.DataGridResultInfo;
import com.jim.yygh.service.IYsxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by jim on 2017/3/29.
 */
@Controller
@RequestMapping(value = "/ysxxController")
public class YsxxController {
    @Autowired
    private IYsxxService ysxxService;
    @RequestMapping(value = "/ysxxList")
    public ModelAndView ysxxList(HttpServletRequest request, HttpServletResponse response){
        String id = request.getParameter("id");
        ModelAndView mav= new ModelAndView();
        mav.addObject("id",id);
        mav.setViewName("/client/ysxxList");

        return mav;

    }
    @RequestMapping(value = "/findYsxxByKsId")
    @ResponseBody
    public DataGridResultInfo findYsxxByKsId(HttpServletRequest request, HttpServletResponse response){
        String id = request.getParameter("id");
        DataGridResultInfo dgri=new DataGridResultInfo();
       List<YsxxCustom> ysxxlist=ysxxService.findYsxxByKsId(id);
        if (ysxxlist!=null&&ysxxlist.size()>0)
        dgri.setRows(ysxxlist);


        return dgri;
    }

}
