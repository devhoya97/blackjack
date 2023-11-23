## 간단 블랙잭 게임 구현하기 

### 기본 규칙

- 카드 덱에는 52장의 카드가 섞여있다.
- 각각의 카드는 숫자 값을 가지며 크기는 1 - 11까지이다.
- 1-10까지는 각 4장이며, 11은 12장 들어있다.
- 플레이어는 최초 1000원의 자산을 가지고 게임을 시작한다.
- 게임을 시작하기전 플레이어는 게임에 베팅할 금액을 100원 단위로 입력할 수 있다. 베팅의 최대금액은 현재 보유한 전 재산이다.
- 최초 게임을 시작하면 플레이어는 카드 덱에서 무조건 한 장의 카드를 받고 이를 콘솔에 출력한다.
- 이후 플레이어는 반복적으로 카드를 받을지 여부를 결정할 수 있다.

### 승패 결정

- 플레이어가 받은 카드의 합이 22 이상이면 무조건 플레이어의 패배이다. 이 때 딜러는 카드를 받지 않는다.
- 플레이어가 카드를 더 이상 안 받기로 결정한 시점에서 딜러도 카드를 받는다.
- 딜러는 16 이하이면 무조건 카드를 받고, 17 이상이면 카드를 받지 않는다.
- 플레이어의 카드 합이 딜러보다 크다면 플레이어의 승리이다.
- 딜러의 카드가 22 이상이어도 플레이어의 승리이다.
- 딜러의 카드합이 더 큰 값이라면 딜러의 승리이다.
- 같은 값이라면 서로 비기게 된다. 단 딜러가 21을 뽑을 경우도 딜러가 승리한다.
- 한 게임이 종료되면 플레이어는 다시 게임을 할지 여부를 결정할 수 있다.

### 베팅 관련 규칙

- 승리하면 베팅한 금액만큼 플레이어의 자산이 증가한다.
- 패배하면 베팅한 금액은 사라진다.
- 블랙잭(합이 21)으로 승리할 경우 베팅한 금액의 두 배를 돌려받는다.

### 기타 규칙

- 게임 재시작시 덱의 카드가 10장 이하로 남아 있을 경우 다시 새로운 덱을 가져와서 게임을 시작한다.
- 플레이어의 자산이 0이 되었다면 강제로 게임이 종료된다.

### 치트

- 입력화면에서 'codesquad' 라고 입력할 경우 남아 있는 덱의 카드를 순서대로 6장 보여준다.

### 출력 화면

- 게임 시작시
  - 최초 게임을 시작하면 게임의 타이틀을 표시한다.
  - 다음 줄에는 현재 게임 횟수와 플레이어의 자산을 표시한다.
  - 다음 줄에는 게임에 걸 돈을 물어보는 프롬프트를 출력하고 입력을 받는다.

- 게임 중
  - 현재 게임 횟수와 플레이어의 자산을 표시한다.
  - 다음 줄에는 플레이어의 카드합을 표시해 준다.
  - 마지막 줄에는 더 카드를 받을지 여부를 표시하고 플레이어의 입력을 받는다.
  - 플레이어가 카드를 더 안 받기로 결정하면 딜러의 카드합과 승부결과를 출력해 준다.
  
- 각 게임 종료시
  - 게임 종료시 플레이어의 남은 자산을 표시해 준다.
  - 각 게임이 종료되었을 경우 다시 게임하기를 선택할 수 있다.
  - 만약 플레이어가 게임 종료를 선택할 경우 지금까지의 승무패 기록과 남은 재산을 보여주고 게임을 종료한다.

### 플레이어의 입력

- 플레이어의 입력은 숫자, Y, N 만 입력 가능하다.
  - 다만 대문자와 소문자 모두 입력 가능하며 그 외의 경우는 다시 입력을 받는다.

```
간단 카드 게임을 시작합니다.
현재 재산: 1000
얼마를 거시겠습니까? 100

GAME 1
플레이어: [11]
총합: 11
카드를 더 받겠습니까? (Y / N) y

GAME 1
플레이어: [11] [13]
총합: 24
당신의 패배입니다. 현재 재산: 900
한 게임 더 하시겠습니까? (Y / N) yes
잘못 입력하셨습니다.
한 게임 더 하시겠습니까? (Y / N) y
얼마를 거시겠습니까? 2000
잘못 입력하셨습니다.
얼마를 거시겠습니까? 만원
잘못 입력하셨습니다.
얼마를 거시겠습니까? 900

GAME 2
플레이어: [10]
총합: 7
카드를 더 받겠습니까? (Y / N) y
플레이어: [10][11]
총합: 21
카드를 더 받겠습니까? (Y / N) n
딜러: [10][10]
딜러의 카드 합계는 20입니다.
당신의 승리입니다. 
현재 남은 자산: 2700
한 게임 더 하시겠습니까? (Y / N) y
얼마를 거시겠습니까? 2700

(중간 생략)

Game 3
플레이어: [11][8]
총합: 19
카드를 더 받겠습니까? (Y / N) codesquad
덱의 카드 [2][10][9][5][7]
카드를 더 받겠습니까? (Y / N) y
플레이어: [11][8][2]
총합: 21
카드를 더 받겠습니까? (Y / N) n
딜러: [9][5][7]
당신의 승리입니다.
남은 재산: 25500
한 게임 더 하시겠습니까? (Y / N) n

10승 3무 9패로 25500원의 자산이 남았습니다.
플레이 해 주셔서 감사합니다.
```
***

### 2단계 코딩 요구사항

- 너무 크지 않은 함수 단위로 구현하고 중복된 코드를 줄이도록 노력한다.
- 전역변수의 사용을 자제한다.
- 객체, 리스트, 배열 등을 적절히 활용한다.
- 1단계와 같이 README.md 파일을 작성한다.
- 구현 완료 커밋에 v2 태그를 생성하고 GitHub에 push 한다

***

### 구현할 기능 목록(풀이 과정)
- 입력
  - [ ] 잘못된 입력을 받았을 시 안내 메시지를 출력후 다시 입력받는다.
  - [x] 게임 시작 전 베팅할 금액을 입력받는다.
    - [x] 숫자만 입력할 수 있다.
    - [x] 100원 단위로 입력할 수 있다.
    - [x] 베팅의 최대 금액은 현재 보유한 전 재산이다.
  - [ ] 카드를 더 받을지 여부를 입력받는다.
    - [ ] Y 또는 N만 입력할 수 있다.
    - [ ] 소문자도 입력 가능하다.
  - [ ] 한 게임이 종료됐을 때, 게임을 더 진행할 지 입력받는다.
    - [ ] Y 또는 N만 입력할 수 있다.
    - [ ] 소문자도 입력 가능하다.
  - [ ] 입력화면에서 'codesquad'를 입력할 경우, 치트가 입력됐음을 로직에게 알려준다.
- 로직
  - [ ] 한 게임이 종료되면 플레이어의 입력에 따라 게임을 더 진행할 지 결정한다.
  - [ ] 치트가 입력됐을 경우 남아 있는 덱의 카드를 순서대로 6장 보여준다.
  - [ ] 52장의 카드 덱을 구성한다.
    - [ ] 1~11 중 무작위 값을 가지는 카드를 생성한다.
    - [ ] 1~10까지는 각 4장이며, 11은 12장 들어있다.
    - [ ] 게임 재시작시 덱의 카드가 10장 이하로 남아 있을 경우 덱을 새롭게 리셋한다.
  - [ ] 플레이어의 자산을 관리한다.
    - [x] 최초자산 1000원을 지급한다.
    - [x] 승리하면 베팅한 금액만큼 자산이 증가한다.
    - [ ] 블랙잭(합이 21)으로 승리할 경우 베팅한 금액의 두 배만큼 자산이 증가한다.
    - [ ] 플레이어의 자산이 0이 되었다면 강제로 게임이 종료된다.
  - [ ] 게임을 진행한다.
    - [ ] 플레이어가 카드를 더 받을지 여부는 입력 값에 따라 결정된다.
    - [ ] 카드 지급시 카드 덱에서 해당 카드를 제거한다.
    - [ ] 플레이어가 카드를 더 이상 안 받기로 결정한 시점에서
      - [ ] 딜러가 카드를 받기 시작한다.
        - [ ] 딜러는 카드 합이 16 이하이면 무조건 카드를 받고, 17 이상이면 카드를 받지 않는다.
      - [ ] 승패를 결정한다.
        - [ ] 카드 합이 22 이상이면 무조건 패배이다.
          - [ ] 플레이어의 카드 합이 22 이상이면 무조건 플레이어의 패배이고, 이 때 딜러는 카드를 받지 않는다.
          - [ ] 딜러의 카드 합이 22 이상이면 플레이어의 승리이다.
        - [ ] 카드 합이 더 큰 쪽이 승리한다.
          - [ ] 플레이어의 카드 합이 딜러의 카드 합보다 크면 플레이어의 승리이다.
          - [ ] 플레이어의 카드 합이 딜러의 카드 합보다 작으면 딜러의 승리이다.
        - [ ] 같은 값이라면 서로 비긴다. 
          - [ ] 단, 딜러가 21을 뽑을 경우 딜러가 승리한다.
- 출력
  - [x] 최초 게임 시작시 필요한 메시지를 출력한다.
    - [x] 게임의 타이틀을 출력한다.
    - [x] 초기 플레이어의 재산을 출력한다.
  - [ ] 게임의 진행상황을 출력한다.
    - [ ] 현재 라운드를 출력한다.
    - [ ] 현재 플레이어가 갖는 카드들을 출력한다.
    - [ ] 현재 플레이어가 갖는 카드들의 총합을 출력한다.
  - [ ] 게임의 결과를 출력한다. 
    - [ ] 승패를 출력한다.
    - [ ] 현재 자산을 출력한다.
  - [ ] 모든 게임의 결과를 출력한다.
    - [ ] 승무패 기록을 출력한다.
    - [ ] 남은 자산을 출력한다.
    - [ ] 프로그램 종료 문구를 출력한다.

### 코드 설명
- 코딩테스트 시 자세히 작성하도록 하겠습니다. 감사합니다.
### 실행 결과
```
```