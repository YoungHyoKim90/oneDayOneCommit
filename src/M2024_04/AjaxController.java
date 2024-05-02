package M2024_04;

//import java.net.URLDecoder;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
/*
 * import javax.annotation.Resource; import
 * javax.servlet.http.HttpServletRequest;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.beans.factory.annotation.Qualifier; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestParam; import
 * org.springframework.web.servlet.ModelAndView;
 * 
 * import egovframework.lab.ajax.service.DepartmentService; import
 * egovframework.lab.ajax.service.EmployeeService; import
 * egovframework.lab.com.vo.Department;
 * 
 * @Controller public class AjaxController {
 * 
 * 
 * 
 * @Autowired
 * 
 * @Qualifier("employeeService") private EmployeeService employeeService;
 * 
 * @Resource(name="departmentService") private DepartmentService
 * departmentService;
 * 
 * // autoComplete 기능을 위한 요청 처리 메서드
 * 
 * @RequestMapping(value = "/autoComplete.do") public ModelAndView
 * simpleAjax(@RequestParam("keyword") String keyword) throws Exception {
 * 
 * // ModelAndView 객체 생성 ModelAndView modelAndView = new ModelAndView(); // 뷰 이름
 * 설정 (jsonView는 JSON 형식의 응답을 위한 뷰) modelAndView.setViewName("jsonView");
 * 
 * // URL 디코딩을 통한 키워드 추출 String searchName = URLDecoder.decode(keyword,
 * "utf-8");
 * 
 * // TODO [Step 2-2-2] autoComplete의 리스트를 DB를 통하여 가져온다. // DB에서 검색어에 해당하는 리스트를
 * 가져오는 로직을 작성해야 함
 * 
 * // 가져온 리스트를 modelAndView에 추가 // modelAndView.addObject("resultList",
 * nameList);
 * 
 * return modelAndView; }
 * 
 * // linked selectbox 처리 기능을 위한 요청 처리 메서드
 * 
 * @RequestMapping("/autoSelectDept.do") protected ModelAndView
 * getDeptInfoforSelectTag(HttpServletRequest request) throws Exception {
 * 
 * // ModelAndView 객체 생성 ModelAndView modelAndView = new ModelAndView(); // 뷰 이름
 * 설정 (jsonView는 JSON 형식의 응답을 위한 뷰) modelAndView.setViewName("jsonView");
 * 
 * // URL 디코딩을 통한 파라미터 추출 String superdeptid =
 * URLDecoder.decode(request.getParameter("superdeptid"), "utf-8"); String depth
 * = URLDecoder.decode(request.getParameter("depth"), "utf-8");
 * 
 * // 파라미터를 Map에 저장 Map<String, String> param = new HashMap<String, String>();
 * param.put("superdeptid", superdeptid); param.put("depth", depth);
 * 
 * // 부서 리스트를 가져오는 서비스 메서드 호출 List<Department> deptList =
 * departmentService.getDepartmentList(param);
 * 
 * // 가져온 부서 리스트를 modelAndView에 추가 modelAndView.addObject("depthList",
 * deptList);
 * 
 * return modelAndView; } }
 */
