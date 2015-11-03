package demo

class CustomTagLib {
    def myTag = { attrs ->
        String imageElement = "<img src=\"${asset.assetPath(src: 'grails-cupsonly-log-white.svg')}\" />"
        out << imageElement
    }
}
