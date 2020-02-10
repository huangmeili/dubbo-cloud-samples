package dubbo.rest.provider.service.impl;

import dubbo.api.DefaultCalculateService;
import org.apache.dubbo.config.annotation.Service;


/**
 * @author huangqingqing
 * @description:
 * @date : 2020-02-09 10:45
 * @history 2020-02-09 10:45 huangqingqing create.
 */
@Service(protocol = {"dubbo"})
public class DefaultCalculateServiceImpl implements DefaultCalculateService {

    @Override
    public String haveCode() {
        return "AA";
    }
}
