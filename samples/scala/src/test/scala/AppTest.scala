package com.example

import com.typesafe.play.mini.Routes

import org.specs2.mutable._
import play.api.test.{Helpers => PlayHelpers, _}
import play.api.test.Helpers.{GET, POST, PUT, DELETE}

class AppSpec extends SpecificationWithJUnit {
  "GET /coco" should {
    "respond with a success (OK)" in {
      PlayHelpers.running(FakeApplication()) {
        val result = PlayHelpers.routeAndCall(FakeRequest(GET, "/coco")).get

        PlayHelpers.status(result) must equalTo(PlayHelpers.OK)
      }
    }
  }
}
