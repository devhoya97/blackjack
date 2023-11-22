## 간단 카드 게임 구현하기 


### 기본 규칙

- 카드 덱에는 무한하게 많은 카드들이 있다고 가정한다.
- 각각의 카드는 숫자 값을 가지며 크기는 1 - 11까지이다.
- 게임을 시작하면 플레이어의 카드를 무작위로 선택해서 출력한다.
- 플레이어 카드 아래에는 딜러의 카드도 무작위로 선택해서 출력한다.
- 이후 플레이어는 반복적으로 게임 중단 여부를 결정할 수 있다.

### 승패 결정

- 플레이어가 딜러보다 값이 큰 카드를 뽑았을 경우 플레이어의 승리이다.
- 반대로 딜러가 더 큰 값이라면 딜러의 승리이다.
- 같은 값이라면 서로 비기게 된다.
- 각 게임 종료시 플레이어는 다시 게임을 할지 여부를 결정할 수 있다.

### 출력 화면

- 최초 게임을 시작하면 게임의 타이틀을 표시한다.
- 다음 줄에는 현재 게임 횟수를 출력한다.
- 다음 줄에는 플레이어가 뽑은 카드를 누적해서 출력한다.
- 다음 줄에는 딜러가 뽑은 카드를 누적해서 출력한다.
- 다음 줄에는 현재 게임의 승리자를 표시해 준다.
- 마지막 줄에는 게임을 계속할지 여부를 물어보는 프롬프트를 출력한다.

```
간단 카드 게임을 시작합니다.

Game 1
You   : [ 9]
Dealer: [10]
딜러가 이겼습니다.
현재 전적: 0승 1패
한 게임 더 하시겠습니까? (Y / N) Y
```

### 입력

- 플레이어의 입력은 Y 또는 N 만 입력 가능하다.
- 다만 대문자와 소문자 모두 입력 가능하며 그 외의 경우는 다시 입력을 받는다.

### 게임 종료시

- 플레이어가 게임 종료를 선택할 경우 종료 메시지를 출력하고 프로그램을 종료한다.

***

### 프로그램 예시

```
간단 카드 게임을 시작합니다.

Game 1
You   : [ 9]
Dealer: [10]
딜러가 이겼습니다.
현재 전적: 0승 1패
한 게임 더 하시겠습니까? (Y / N) Y

Game 2
You   : [ 9] [5]
Dealer: [10] [2]
당신이 이겼습니다.
현재 전적: 1승 1패
한 게임 더 하시겠습니까? (Y / N) x
잘못 입력하셨습니다.
한 게임 더 하시겠습니까? (Y / N) y

Game 3
You   : [ 9] [5] [7]
Dealer: [10] [2] [7]
비겼습니다.
현재 전적: 1승 1무 1패
한 게임 더 하시겠습니까? (Y / N) y

Game 4
You   : [ 9] [ 5] [ 7] [10]
Dealer: [10] [ 2] [ 7] [11]
딜러가 이겼습니다.
현재 전적: 1승 1무 2패
한 게임 더 하시겠습니까? (Y / N) N
게임을 종료합니다.
플레이해주셔서 감사합니다.
```

***

### 1단계 코딩 요구사항

- 컴파일 또는 실행이 가능해야 한다.
- 컴파일이나 실행되지 않을 경우 큰 감점 요인이므로 주의!
- 자기만의 기준으로 최대한 간결하게 코드를 작성한다.
- README.md에 풀이 과정 및 코드 설명, 실행 결과를 기술한다.
- 1단계 완료 커밋에 v1 태그를 만들고 저장소에 push한다.

***

### 구현할 기능 목록(풀이 과정)
- 입력
  - [x] 게임을 계속할지 여부를 입력받는다.
    - [x] 게임을 계속할지 여부를 물어보는 프롬프트를 출력한다.
    - [x] 플레이어의 입력이 Y 또는 N이 아닐 경우 안내 메시지 출력 후 입력을 다시 받는다.

- 로직
  - [x] 카드를 분배한다.
    - [x] 1~11 중 무작위 값을 가지는 카드를 생성한다.
    - [x] 카드를 2개 생성하여 플레이어와 딜러에게 각각 나눠준다.
  - [x] 승패를 결정한다.
    - [x] 더 큰 값을 갖는 사람이 승리한다.
    - [x] 같은 값이라면 서로 비기게 된다.
  - [x] 입력 값에 따라 게임을 계속할지 결정한다.
    - [x] 플레이어가 Y를 입력할 경우 한 게임 더 진행한다.
    - [x] 플레이어가 N을 입력할 경우 게임을 종료한다.
- 출력
  - [x] 최초 게임을 시작하면 게임의 타이틀을 표시한다.
  - [x] 매 턴마다 필요한 메시지들을 출력한다.
    - [x] 현재 게임 횟수를 출력한다.
    - [x] 플레이어가 뽑은 카드를 누적해서 출력한다.
    - [x] 딜러가 뽑은 카드를 누적해서 출력한다.
    - [x] 현재 게임의 승리자를 표시한다.
    - [x] 현재까지의 전적을 출력한다.
  - [x] 게임이 종료되면 안내메시지를 출력한다.

### 코드 설명
- 코딩테스트 시 자세히 작성하도록 하겠습니다. 감사합니다.
### 실행 결과
```
간단 카드 게임을 시작합니다.

Game 1
You   : [ 5] 
Dealer: [ 5] 
비겼습니다.
현재 전적: 0승 1무 0패
한 게임 더 하시겠습니까? (Y / N) y

Game 2
You   : [ 5] [ 7] 
Dealer: [ 5] [ 8] 
딜러가 이겼습니다.
현재 전적: 0승 1무 1패
한 게임 더 하시겠습니까? (Y / N) x
잘못 입력하셨습니다.
한 게임 더 하시겠습니까? (Y / N) y

Game 3
You   : [ 5] [ 7] [ 2] 
Dealer: [ 5] [ 8] [ 3] 
딜러가 이겼습니다.
현재 전적: 0승 1무 2패
한 게임 더 하시겠습니까? (Y / N) y

Game 4
You   : [ 5] [ 7] [ 2] [ 2] 
Dealer: [ 5] [ 8] [ 3] [ 1] 
당신이 이겼습니다.
현재 전적: 1승 1무 2패
한 게임 더 하시겠습니까? (Y / N) n
게임을 종료합니다.
플레이해주셔서 감사합니다.
```