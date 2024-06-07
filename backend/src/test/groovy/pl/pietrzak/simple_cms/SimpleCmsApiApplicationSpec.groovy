package pl.pietrzak.simple_cms

import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class SimpleCmsApiApplicationSpec extends Specification {
    def "test always passing"(){
        expect:
        true
    }
}
