package demo

import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import spock.lang.Specification
import asset.pipeline.grails.AssetsTagLib

@TestFor(CustomTagLib)
@Mock(AssetsTagLib)
class CustomTagLibSpec extends Specification {

    void "test custom tag"() {
        when:
        def output = applyTemplate('<g:myTag/>')

        then:
        output == '<img src="/tagissue/assets/grails-cupsonly-log-white.svg" />'
    }
}
