/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.google.calendar.stream;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class GoogleCalendarStreamComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.google.calendar.stream.GoogleCalendarStreamConfiguration getOrCreateConfiguration(GoogleCalendarStreamComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.google.calendar.stream.GoogleCalendarStreamConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        GoogleCalendarStreamComponent target = (GoogleCalendarStreamComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": getOrCreateConfiguration(target).setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "applicationname":
        case "applicationName": getOrCreateConfiguration(target).setApplicationName(property(camelContext, java.lang.String.class, value)); return true;
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "calendarid":
        case "calendarId": getOrCreateConfiguration(target).setCalendarId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientfactory":
        case "clientFactory": target.setClientFactory(property(camelContext, org.apache.camel.component.google.calendar.GoogleCalendarClientFactory.class, value)); return true;
        case "clientid":
        case "clientId": getOrCreateConfiguration(target).setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientsecret":
        case "clientSecret": getOrCreateConfiguration(target).setClientSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.google.calendar.stream.GoogleCalendarStreamConfiguration.class, value)); return true;
        case "considerlastupdate":
        case "considerLastUpdate": getOrCreateConfiguration(target).setConsiderLastUpdate(property(camelContext, boolean.class, value)); return true;
        case "consumefromnow":
        case "consumeFromNow": getOrCreateConfiguration(target).setConsumeFromNow(property(camelContext, boolean.class, value)); return true;
        case "delegate": getOrCreateConfiguration(target).setDelegate(property(camelContext, java.lang.String.class, value)); return true;
        case "emailaddress":
        case "emailAddress": getOrCreateConfiguration(target).setEmailAddress(property(camelContext, java.lang.String.class, value)); return true;
        case "healthcheckconsumerenabled":
        case "healthCheckConsumerEnabled": target.setHealthCheckConsumerEnabled(property(camelContext, boolean.class, value)); return true;
        case "healthcheckproducerenabled":
        case "healthCheckProducerEnabled": target.setHealthCheckProducerEnabled(property(camelContext, boolean.class, value)); return true;
        case "maxresults":
        case "maxResults": getOrCreateConfiguration(target).setMaxResults(property(camelContext, int.class, value)); return true;
        case "p12filename":
        case "p12FileName": getOrCreateConfiguration(target).setP12FileName(property(camelContext, java.lang.String.class, value)); return true;
        case "query": getOrCreateConfiguration(target).setQuery(property(camelContext, java.lang.String.class, value)); return true;
        case "refreshtoken":
        case "refreshToken": getOrCreateConfiguration(target).setRefreshToken(property(camelContext, java.lang.String.class, value)); return true;
        case "scopes": getOrCreateConfiguration(target).setScopes(property(camelContext, java.util.List.class, value)); return true;
        case "serviceaccountkey":
        case "serviceAccountKey": getOrCreateConfiguration(target).setServiceAccountKey(property(camelContext, java.lang.String.class, value)); return true;
        case "syncflow":
        case "syncFlow": getOrCreateConfiguration(target).setSyncFlow(property(camelContext, boolean.class, value)); return true;
        case "user": getOrCreateConfiguration(target).setUser(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": return java.lang.String.class;
        case "applicationname":
        case "applicationName": return java.lang.String.class;
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "calendarid":
        case "calendarId": return java.lang.String.class;
        case "clientfactory":
        case "clientFactory": return org.apache.camel.component.google.calendar.GoogleCalendarClientFactory.class;
        case "clientid":
        case "clientId": return java.lang.String.class;
        case "clientsecret":
        case "clientSecret": return java.lang.String.class;
        case "configuration": return org.apache.camel.component.google.calendar.stream.GoogleCalendarStreamConfiguration.class;
        case "considerlastupdate":
        case "considerLastUpdate": return boolean.class;
        case "consumefromnow":
        case "consumeFromNow": return boolean.class;
        case "delegate": return java.lang.String.class;
        case "emailaddress":
        case "emailAddress": return java.lang.String.class;
        case "healthcheckconsumerenabled":
        case "healthCheckConsumerEnabled": return boolean.class;
        case "healthcheckproducerenabled":
        case "healthCheckProducerEnabled": return boolean.class;
        case "maxresults":
        case "maxResults": return int.class;
        case "p12filename":
        case "p12FileName": return java.lang.String.class;
        case "query": return java.lang.String.class;
        case "refreshtoken":
        case "refreshToken": return java.lang.String.class;
        case "scopes": return java.util.List.class;
        case "serviceaccountkey":
        case "serviceAccountKey": return java.lang.String.class;
        case "syncflow":
        case "syncFlow": return boolean.class;
        case "user": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        GoogleCalendarStreamComponent target = (GoogleCalendarStreamComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": return getOrCreateConfiguration(target).getAccessToken();
        case "applicationname":
        case "applicationName": return getOrCreateConfiguration(target).getApplicationName();
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "calendarid":
        case "calendarId": return getOrCreateConfiguration(target).getCalendarId();
        case "clientfactory":
        case "clientFactory": return target.getClientFactory();
        case "clientid":
        case "clientId": return getOrCreateConfiguration(target).getClientId();
        case "clientsecret":
        case "clientSecret": return getOrCreateConfiguration(target).getClientSecret();
        case "configuration": return target.getConfiguration();
        case "considerlastupdate":
        case "considerLastUpdate": return getOrCreateConfiguration(target).isConsiderLastUpdate();
        case "consumefromnow":
        case "consumeFromNow": return getOrCreateConfiguration(target).isConsumeFromNow();
        case "delegate": return getOrCreateConfiguration(target).getDelegate();
        case "emailaddress":
        case "emailAddress": return getOrCreateConfiguration(target).getEmailAddress();
        case "healthcheckconsumerenabled":
        case "healthCheckConsumerEnabled": return target.isHealthCheckConsumerEnabled();
        case "healthcheckproducerenabled":
        case "healthCheckProducerEnabled": return target.isHealthCheckProducerEnabled();
        case "maxresults":
        case "maxResults": return getOrCreateConfiguration(target).getMaxResults();
        case "p12filename":
        case "p12FileName": return getOrCreateConfiguration(target).getP12FileName();
        case "query": return getOrCreateConfiguration(target).getQuery();
        case "refreshtoken":
        case "refreshToken": return getOrCreateConfiguration(target).getRefreshToken();
        case "scopes": return getOrCreateConfiguration(target).getScopes();
        case "serviceaccountkey":
        case "serviceAccountKey": return getOrCreateConfiguration(target).getServiceAccountKey();
        case "syncflow":
        case "syncFlow": return getOrCreateConfiguration(target).isSyncFlow();
        case "user": return getOrCreateConfiguration(target).getUser();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "scopes": return java.lang.String.class;
        default: return null;
        }
    }
}

