from kivy.app import App
from kivy.uix.boxlayout import BoxLayout
from kivy.uix.label import Label
from kivy.uix.textinput import TextInput
from kivy.uix.button import Button
import random


class NumberGuessApp(App):
    def build(self):
        self.target_number = random.randint(1, 50)  # 랜덤 숫자 생성
        self.attempts = 0

        # 레이아웃 생성
        layout = BoxLayout(orientation='vertical')

        # 레이블
        self.info_label = Label(text="1부터 50 사이의 숫자를 맞춰보세요!")
        layout.add_widget(self.info_label)

        # 입력창
        self.input_box = TextInput(hint_text="숫자를 입력하세요", multiline=False)
        layout.add_widget(self.input_box)

        # 버튼
        self.submit_button = Button(text="확인")
        self.submit_button.bind(on_press=self.check_guess)
        layout.add_widget(self.submit_button)

        # 결과 메시지
        self.result_label = Label(text="")
        layout.add_widget(self.result_label)

        return layout

    def check_guess(self, instance):
        try:
            user_guess = int(self.input_box.text)
            self.attempts += 1

            if user_guess == self.target_number:
                self.result_label.text = f"정답입니다! 🎉 {self.attempts}번 만에 맞췄어요."
                self.submit_button.disabled = True
            elif user_guess > self.target_number:
                self.result_label.text = "DOWN!"
            else:
                self.result_label.text = "UP!"

            if self.attempts >= 7:
                self.result_label.text += "\n7번 시도 초과! 게임이 초기화됩니다."
                self.reset_game()
        except ValueError:
            self.result_label.text = "유효한 숫자를 입력하세요!"

    def reset_game(self):
        self.target_number = random.randint(1, 50)
        self.attempts = 0
        self.submit_button.disabled = False
        self.result_label.text = ""
        self.info_label.text = "1부터 50 사이의 숫자를 다시 맞춰보세요!"
        self.input_box.text = ""


if __name__ == "__main__":
    NumberGuessApp().run()
