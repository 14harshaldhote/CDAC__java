package com.dac.emtt.config;



import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDecisionVoter;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.vote.RoleVoter;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class CustomAccessDecisionManager implements AccessDecisionManager {

    private final RoleVoter roleVoter = new RoleVoter();

    @Override
    public void decide(Authentication authentication, Object object, Collection<ConfigAttribute> configAttributes) {
        int grant = roleVoter.vote(authentication, object, configAttributes);
        if (grant == AccessDecisionVoter.ACCESS_GRANTED) {
            // Access is granted based on role
            return;
        }

        // Add your custom logic here to dynamically decide access based on runtime conditions
        // You can access authentication.getAuthorities() to get the user's roles
        // and configAttributes to get the required roles for the requested resource.
        // Throw AccessDeniedException if access should be denied.

        // For example:
        // if (someCustomCondition) {
        //     throw new AccessDeniedException("Access denied based on custom condition");
        // }
    }

    @Override
    public boolean supports(ConfigAttribute attribute) {
        return roleVoter.supports(attribute);
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return true;
    }
}
