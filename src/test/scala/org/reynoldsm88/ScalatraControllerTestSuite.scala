package org.reynoldsm88

import org.scalatest.flatspec.AnyFlatSpecLike
import org.scalatra.test.scalatest.ScalatraSuite

import org.scalatest.matchers.should.Matchers

class ScalatraControllerTestSuite extends AnyFlatSpecLike with ScalatraSuite with Matchers {

    addServlet( new ScalatraController, "/*" )

    "GET request" should "return 200 for OK" in {
        get( "/results" ) {
            status should equal( 200 )
        }
    }

    "POST request" should "return 201 for CREATED" in {
        val json = "{\"message\":\"michael\"}"
        post( "/results", json.getBytes, Map( "MyHeader" -> "value" ) ) {
            status should equal( 201 )
        }
    }

    override def header = null
}
