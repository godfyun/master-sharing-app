package co.masternote.sharing

import org.scalatra._
import scalate.ScalateSupport

class SharingAppServlet extends MasterSharingAppStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }
  
}
