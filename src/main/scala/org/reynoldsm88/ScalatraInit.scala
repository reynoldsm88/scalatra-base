package org.reynoldsm88

import javax.servlet.ServletContext
import org.scalatra.LifeCycle

class ScalatraInit extends LifeCycle {

    override def init( context : ServletContext ) : Unit = context.mount( new ScalatraController, "/*" )

}
