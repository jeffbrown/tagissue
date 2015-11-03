package demo

import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import spock.lang.Specification
import asset.pipeline.grails.AssetsTagLib
import asset.pipeline.grails.AssetMethodTagLib

@TestFor(CustomTagLib)
@Mock([AssetsTagLib, AssetMethodTagLib])
class CustomTagLibSpec extends Specification {

    static doWithSpring = {
        assetProcessorService MockProcessor
    }
    void "test custom tag"() {
        when:
        def output = applyTemplate('<g:myTag/>')

        then:
        output == '<img src="/some/path/grails-cupsonly-log-white.svg" />'
    }
}

class MockProcessor {
    def assetMapping = 'some/path'
}