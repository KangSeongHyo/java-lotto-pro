# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 개발 요구사항
> 로또 한장의 가격은 `1000원`이다  
> 로또 번호 범위는 `1 ~ 45` 이다

- 구입금액을 입력받는다
  - 구입 금액에 따른 로또 구입 가능 갯수를 확인한다
- 구입 가능 갯수에 따라 로또를 생성한다
  - 로또의 번호는 자동으로 생성한다
- 생성된 로또를 출력한다
  - 각 로또별 번호를 출력한다 (번호는 정렬되어야 한다)
  - 로또의 총 갯수를 출력한다
- 당첨 번호를 입력받는다
- 구입한 로또의 결과를 확인한다
- 확인된 로또의 결과를 출력한다 (당첨 통계)
  - 등수별 결과를 출력한다
  - 총 수익률을 계산하여 출력한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

# 문자열 덧셈 계산기
## 요구사항
- 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환
  - 예: “” => 0, "1,2" => 3, "1,2,3" => 6, “1,2:3” => 6
- 앞의 기본 구분자(쉼표, 콜론)외에 커스텀 구분자를 지정할 수 있다.
  - 커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다.
  - 예를 들어 “//;\n1;2;3”과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6이 반환되어야 한다.
- 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw한다.

## 프로그래밍 요구사항

- indent(들여쓰기) depth를 2단계에서 1단계로 줄여라.
    - depth의 경우 if문을 사용하는 경우 1단계의 depth가 증가한다.
    - if문 안에 while문을 사용한다면 depth가 2단계가 된다.
- 메소드의 크기가 최대 10라인을 넘지 않도록 구현한다.
    - method가 한 가지 일만 하도록 최대한 작게 만들어라.
- else를 사용하지 마라.
