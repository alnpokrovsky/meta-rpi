import QtQuick 2.5
import QtQuick.Window 2.0
import QtWebEngine 1.0

Window {
    width: 640
    height: 480
    visible: true
    WebEngineView {
        anchors.fill: parent
        url: "http://www.qt.io"
    }
}
