import com.jim.yygh.entity.po.Ksxx;
import com.jim.yygh.entity.vo.KsxxCustom;
import com.jim.yygh.entity.vo.KsxxQueryVo;
import com.jim.yygh.entity.vo.PageQuery;
import com.jim.yygh.service.IKsxxService;
import com.jim.yygh.utils.UUIDBuild;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * Created by jim on 2017/3/22.
 */
public class KsDemo extends BaseDemo {
    @Autowired
    private IKsxxService ksxxService;
    @Test
    public void addKs(){

 /*       Ksxx ksxx=new Ksxx();
        ksxx.setAddtime(new Date());
        ksxx.setKsName("内科");
        ksxx.setSfsc("1");
        ksxx.setId(UUIDBuild.getUUID());
        int i = ksxxService.addKsxx(ksxx);
        System.out.print(i);*/
    }
    @Test
    public void findKs(){
        List<KsxxCustom> allKsxx = ksxxService.findAllKsxx(0);
        System.out.print(allKsxx);

    }
    @Test
    public void findKsList() throws Exception {
       /* Ksxx ksxx=new Ksxx();
        ksxx.setKsName("内科");
        List<Ksxx> ksxxByKsName = ksxxService.findKsxxByKsName(ksxx.getKsName());
        if ((ksxxByKsName!=null) && ksxxByKsName.size()>0){
            for (Ksxx ks : ksxxByKsName) {
                System.out.print(ks.toString());
            }
        }*/
        PageQuery pageQuery=new PageQuery();
        pageQuery.setPageQuery_start(0);
        KsxxQueryVo ksxxQueryVo=new KsxxQueryVo();
        ksxxQueryVo.setPageQuery(pageQuery);
        List<KsxxCustom> ksxxList = ksxxService.findKsxxList(ksxxQueryVo);
        System.out.print(ksxxList.toString()+"*****************************************");

    }
    @Test
    public void updateKs(){

    }
    @Test
    public void delKs(){

    }


}
