/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.vm;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.component.seda.SedaComponentConfigurer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class VmComponentConfigurer extends SedaComponentConfigurer implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        VmComponent target = (VmComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        default: return super.configure(camelContext, obj, name, value, ignoreCase);
        }
    }

}
