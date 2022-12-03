package sandbox.spring_mvc

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.servlet.ModelAndView

@Controller
class HelloController {
    @GetMapping
    fun hello(): ModelAndView {
        return ModelAndView("index")
            .addObject("msg", "Hello")
    }

    /**
     * Default mapping url.
     * If request is not expected, the method is triggered.
     *
     * Issue:
     * For "/swagger-ui.html", this method is also triggered. Then can't see swagger ui page.
     * If this method is removed, can see swagger ui page.
     */
    @GetMapping("**")
    fun notFound(): ModelAndView {
        return ModelAndView("index")
            .addObject("msg", "Not found")
    }
}