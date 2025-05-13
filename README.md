# I always forget

Do you remember the difference between the following ?

* HttpServletRequest#getServletPath()
* HttpServletRequest#getRequestURI()
* HttpServletRequest#getRequestURL()

Run the following command to observe the differences:

```shell
./mvnw spring-boot:run
```

Then, open the following URL in your browser:

[`http://localhost:8080/ctx/anypath/you/want/to/test`](http://localhost:8080/ctx/anypath/you/want/to/test)

You will see the following output:

```text
Servlet Path: /anypath/you/want/to/test
Request URI: /ctx/anypath/you/want/to/test
Request URL: http://localhost:8080/ctx/anypath/you/want/to/test
```

If you want to change the context path from `/ctx`, you can do so with the following command:

```shell
SERVER_SERVLET_CONTEXT_PATH=//foo ./mvnw spring-boot:run
```
