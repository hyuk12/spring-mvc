package hello.servlet.web.frontcontroller;

import java.util.HashMap;
import java.util.Map;
// 모델 객체를 따로 분리 시켜준다
public class ModelView {

    private String viewName; // 모델의 논리적 이름
    private Map<String, Object> model = new HashMap<>();

    public ModelView(String viewName) {
        this.viewName = viewName;
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    public Map<String, Object> getModel() {
        return model;
    }

    public void setModel(Map<String, Object> model) {
        this.model = model;
    }
}
