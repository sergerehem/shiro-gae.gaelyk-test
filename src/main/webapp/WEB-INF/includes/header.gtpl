<% import org.apache.shiro.SecurityUtils %>
<html>
    <head>
        <title>Gaelyk</title>
        
        <link rel="shortcut icon" href="/images/gaelyk-small-favicon.png" type="image/png">
        <link rel="icon" href="/images/gaelyk-small-favicon.png" type="image/png">
        
        <link rel="stylesheet" type="text/css" href="/css/main.css"/>
    </head>
    <body>
        <div>
            <img src="/images/gaelyk.png">
            <img src="/images/google-app-engine-groovy.png" align="right">            
        </div>
        <% def user = SecurityUtils.subject %>
        <% if (user?.isAuthenticated()) { %>
          <div>
              Logged in as <strong>${user.getPrincipal()}</strong> -
              <a href="logout.groovy">logout</a>
          </div>
        <% } %>
        <div>
