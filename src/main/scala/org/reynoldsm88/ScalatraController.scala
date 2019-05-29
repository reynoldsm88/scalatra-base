package org.reynoldsm88

import org.scalatra.{Created, Ok, ScalatraServlet}

class ScalatraController extends ScalatraServlet {

    get( "/results" ) {
        Ok()
    }

    post( "/results" ) {
        Created()
    }
}