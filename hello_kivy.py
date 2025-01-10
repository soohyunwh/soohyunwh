## - 라이브러리포토 임포트 -
from kivy.app import App
#kivy에서 제공하는 app클래스를 가져온다
#kivy애플리케이션을 만들기 위해 반드시 필요한 클래스

from kivy.uix.label import App
#화면에 텍스트(label)을 표시하기 위한 위젯을 가져옵니다
#이 코드에서는 "hello,kivy!"라는 텍스트를 화면에 표시한다

## - 앱 클래스 정의 -
class MyApp(App):
#우리가 만들 애플리케이션의 이름을 MyApp으로 정의합니다.
#kivy의 App클래스를 상속받아 새로운 애플리케이션을 만든다

## - 화면 내용 정의(build 메서드) -
def build(self):
#App클래스에서 반드시 구현해야하는 메서드
#이 메서드는 앱이 실행될때 화면에 표시할 내용을 반환
    return label(text='hello kivy!')
#'hello kivy'라는 텍스트를 가진 label위젯을 화면에 표시한다
#label은 단순한 텍스트 표시용 위젯

## - 앱 실행 -
if __name__ == '__main__':
#이 코드는 현재 파일이 직접 실행될때만 실행되도록 보장한다
#다른 파일에서 이 파일을 불러올 경우 이 코드는 실행되지 않는다
    MyApp().run()
    #우리가 만든 MyApp클래스의 인스턴스를 생성하고 실행합니다
    #run()메서드는 kivy앱을 시작한다
    #앱 창을 띄우고 build메서드에서 반환된 내용을 화면에 표시한다


