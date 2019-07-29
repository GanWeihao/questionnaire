package com.system.questionnaire.controller;

import com.system.questionnaire.model.Problem;
import com.system.questionnaire.model.Survey;
import com.system.questionnaire.service.ProblemService;
import com.system.questionnaire.util.Constants;
import com.system.questionnaire.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.DecimalFormat;
import java.util.List;

@RestController
public class ProblemController {
    @Autowired
    ProblemService problemService;

    //添加问题
    @ResponseBody
    @RequestMapping(value = "/problem/insert", method = RequestMethod.GET)
    public JsonResult insert(Problem problem){
        JsonResult js;
        try{
            problemService.insertSelective(problem);
            js = new JsonResult(Constants.STATUS_SUCCESS,"1");
        }catch (Exception e){
            js = new JsonResult(Constants.STATUS_FAIL,"0");
        }
        return js;
    }

    //根据问卷ID查问题
    @ResponseBody
    @RequestMapping(value = "/problem/selectall", method = RequestMethod.GET)
    public JsonResult selectall(Problem problem){
        JsonResult js;
        try{
            List<Problem> list = problemService.selectBySurveyId(problem.getProblemSurveyId());
//            for(Problem problem1 : list){
//                Double i = problem1.getOptionsOneNum() + problem1.getOptionsTwoNum() +problem1.getOptionsThreeNum() + problem1.getOptionsFourNum();
//                Double s1 = Double.valueOf(df.format(Math.round((problem1.getOptionsOneNum()/i)*100*100)/100.0));
//                Double s2 = Double.valueOf(df.format(Math.round((problem1.getOptionsTwoNum()/i)*100*100)/100.0));
//                Double s3 = Double.valueOf(df.format(Math.round((problem1.getOptionsThreeNum()/i)*100*100)/100.0));
//                Double s4 = Double.valueOf(df.format(Math.round((problem1.getOptionsFourNum()/i)*100*100)/100.0));
//                problem1.setOptionsOneNum(s1);
//                problem1.setOptionsTwoNum(s2);
//                problem1.setOptionsThreeNum(s3);
//                problem1.setOptionsFourNum(s4);
//                System.out.println(s1);
//                System.out.println(s2);
//                System.out.println(s3);
//                System.out.println(s4);
//            }
            js = new JsonResult(Constants.STATUS_SUCCESS,"查找成功",list);
        }catch (Exception e){
            js = new JsonResult(Constants.STATUS_FAIL,"查找异常");
        }
        return js;
    }

    //参与问卷关于问题字段数量+1
    @ResponseBody
    @RequestMapping(value = "/problem/updateoptions", method = RequestMethod.GET)
    public JsonResult updateoptions(Problem problem){
        JsonResult js;
         try{
             Problem problem1 = new Problem();
             problem1.setProblemId(problem.getProblemId());
             if(problem.getOptionsOne().equals("optionsOne")){
                 problem1.setOptionsOne("1");
             }else if(problem.getOptionsTwo().equals("optionsTwo")){
                 problem1.setOptionsTwo("1");
             }else if(problem.getOptionsThree().equals("optionsThree")){
                 problem1.setOptionsThree("1");
             }else if(problem.getOptionsFour().equals("optionsFour")){
                 problem1.setOptionsFour("1");
             }
             problemService.updateOptionsNum(problem1);
             js = new JsonResult(Constants.STATUS_SUCCESS,"成功");
         }catch (Exception e){
             js = new JsonResult(Constants.STATUS_FAIL,"异常"+e.getMessage());
         }
         return js;
    }
}
