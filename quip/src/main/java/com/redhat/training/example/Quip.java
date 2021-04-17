package com.redhat.training.example;

import javax.ws.rs.path;
import javax.ws.rs.core.response;
import javax.ws.rs.get;
import javax.ws.rs.produces;
import java.net.inetaddress;


@path("/")
public class quip {

@get
@produces("text/plain")
public response index() throws exception {
    string host = inetaddress.getlocalhost().gethostname();
    return response.ok("veni, vidi, vici...\n").build();
  }

@get
@path("/ready")
@produces("text/plain")
public response ready() throws exception {
    return response.ok("ok\n").build();
  }

}

