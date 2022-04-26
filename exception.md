# 예외 처리(Excepyion)

* __프로그램 오류__ : 프로그램 수행 시 치명적 상황이 발생하여 비정상 종료 상황이 발생한 것, `프로그램 에러`라고도 한다.
* __오류의 종류__ 
  * __컴파일 에러__ : 프로그램의 실행을 막는 소스 상의 문법 에러, 소스 구문을 수정하여 해결한다.
  * __런타임 에러 __: 입력 값이 틀렸거나, 배열의 인덱스 범위를 벗어났거나, 계산식의 오류 등 주로 `if문` 사용으로 에러 처리한다.
  * __시스템 에러__  : 컴퓨터 오작동으로 인한 에러, 소스 구문으로 `해결 불가`

* __오류 해결 방법__ : 소스 수정으로 해결 가능한 에러를  `예외(Exception)` 라고 하는데 이러한 예외 상황(예측 가능한 에러) 구문을 처리 하는 방법인 `예외처리` 를 통해 해결한다.

---



* <h3>RuntimeException 클래스</h3>

  * `Unchecked Exception`으로 주로 프로그래머의 부주의로 인한 오류인 경우가 많기 때문에 `예외 처리`보다는 __코드를 수정__해야 하는 경우가 많다.
  * __RuntimeException 후손 클래스__
    * ArithmeticException
    * ArrayIndexOutOfBoundsException
    * NullPointerException
    * ClassCastException
    * NegativeArraySizeException

---



* __예외처리 방법__

  * __Exception 처리를 호출한 메소드에게 위임__: 메소드 선언 시 throws ExceptionName문을 추가하여 호출한 상위 메소드에게 처리 위임 계속 위임하면 main()메소드까지 위임하게 되고 거기서도 처리되지 않는 경우 비정상 종료.

  * __Exception이 발생한 곳에서 직접 처리__ 

    * `try~catch문`을 이용하여 예외처리

      `try` : exception 발생할 가능성이 있는 코드를 안에 기술 

      

      `catch` : try 구문에서 exception 발생 시 해당하는 exceptio에 대한 처리 기술 

      ​				여러 개의 exception처리가 가능하나 exception간의 상속 관계 고려 

      

      `finally` : exception 발생 여부와 관계없이 꼭 처리해야 하는 로직 기술 

      ​				중간에 return문을 만나도 finally구문은 실행되지만 

      ​				System.exit();를 만나면 무조건 프로그램 종료 

      ​				주로 java.io나 java.sql 패키지의 메소드 처리 시 이용

  * __throws로 예외 던지기__

    ```java
    public void methodC() throws IOException { //throws IOException 상위메소드, 클래스로 전달
    	throw new IOException();
    	//Exception 발생
    }
    
    ```

    

    