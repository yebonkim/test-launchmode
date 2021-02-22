# 그림으로 이해하는 Activity LaunchMode 실험👩‍🔬

해당 레포는 아래 블로그 글 작성에 필요한 실험들을 진행한 레포입니다.
실험 내용과 결과에 대한 이미지들을 참고하고 싶으시다면 아래 사이트를 방문해주세요.😊<br>
https://yebon-kim.tistory.com/6

### 브랜치 및 브랜치의 테스트 내용
- 1️⃣ standard
  - MainActivity를 3번 호출하여 LifeCycle을 관찰합니다.
- 2️⃣ singleTop
  - MainActivity를 3번 호출하여 LifeCycle을 관찰합니다.
- 3️⃣ singleTask
  - 실험1 : Main -> 2 -> 3 -> Main Activity 순으로 호출하여 각 Activity의 LifeCycle을 관찰합니다.
  - 실험2 : 2개의 Task에 나눠진 Activity들을 호출하여 각 Activity의 LifeCycle을 관찰합니다.
- 4️⃣ singleInstance
  - Main -> 2 -> 3 -> Main Activity 순으로 호출하여 각 Activity의 LifeCycle을 관찰합니다.

---
(+번외편)
- 5️⃣ singleInstance-additional
  - Main -> 2(singleInstance) -> 3 -> Main Activity 순으로 호출하여 각 Activity의 LifeCycle을 관찰합니다.

