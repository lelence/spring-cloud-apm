package org.maogogo.portal.dashboard;

import org.maogogo.apm.members.api.IMemberServiceAPI;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "MEMBERS-SERVICES", fallback = IMembersServiceAPIFailure.class)
public interface IMembersServiceAPIFeign extends IMemberServiceAPI {

}
