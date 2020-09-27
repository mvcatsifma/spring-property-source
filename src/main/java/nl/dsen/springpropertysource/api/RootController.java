package nl.dsen.springpropertysource.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource("classpath:/META-INF/build-info.properties")
public class RootController {

  @Value("${build.build}")
  String build;

  @RequestMapping("/")
  public String get() {
    return build;
  }
}
