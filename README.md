[![Build Status](https://travis-ci.org/aerogear/aerogear-jaxrs-demo.png?branch=master)](https://travis-ci.org/aerogear/aerogear-jaxrs-demo)

# AeroGear JAXRS Demo

## Current API

### POST /rest/auth/login

```

curl -3 -v -b cookies.txt -c cookies.txt -H "Accept: application/json" -H "Content-type: application/json" -X
POST http://localhost:8080/aerogear-jaxrs-demo/rest/auth/login  -d '{"loginName":"john","password":"123"}'

```

### POST /rest/auth/logout

```

curl -3 -v -b cookies.txt -c cookies.txt -H "Accept: application/json" -H "Content-type: application/json" -X
POST http://localhost:8080/aerogear-jaxrs-demo/rest/auth/logout

```

### GET /rest/auth/otp/secret

To retrieve the secret

```

curl -3 -v -b cookies.txt -c cookies.txt -H "Accept: application/json" -H "Content-type: application/json" -X
GET http://localhost:8080/aerogear-jaxrs-demo/rest/auth/otp/secret

```

### POST /rest/auth/otp

To login with the OTP secret


```

curl -3 -v -b cookies.txt -c cookies.txt -H "Accept: application/json" -H "Content-type: application/json" -X
POST http://localhost:8080/aerogear-jaxrs-demo/rest/auth/otp  -d '{"secret":"YOUROTP"}'

```

## Test Page

When accessing the app (index.html) you will have a page to test :

* Login
* Logout
* Generate OTP
* Login with OTP




## Community
* [User Forum](https://community.jboss.org/en/aerogear?view=discussions)
* [Developer Mailing List](http://aerogear-dev.1069024.n5.nabble.com)

## Issue Tracker
* [JIRA](https://issues.jboss.org/browse/AEROGEAR)
