import './App.css';
import {useState} from 'react';



function App() {

  let post = "블로그입니다.";
  // post를 중괄호로 감싸서 사용하면 post에 저장된 값 그대로 출력된다.


  // a,b,c 자리에는 state 변경을 도와주는 함수명 넣어주기

  /*
  let [포스팅1,a] = useState('행궁동 카페 추천')   
  let [포스팅2,b] = useState('서울 근교 여행지')  
  let [포스팅3,c] = useState('주말에 가볼만한 곳')   */
  
  let [포스팅,a] = useState(['행궁동 카페', '여행지 추천', '빵지순례'])



  // 변수 문법이 있는데 굳이 state를 쓰는 이유-?
  // 변수보다 state가 유지보수에 용이함
  // 일반 변수는 값이 바뀌어도 React가 자동으로 UI를 업데이트하지 않는다.
  // 반면, state는 값이 바뀌면 React가 컴포넌트를 다시 렌더링하여 UI를 상태와 동기화합니다.


  function 함수이름(){
    console.log(1)
  }
  /* 이렇게 함수를 선언한 뒤 onClick={여기} 안에 넣어줘도 되고,
  중괄호 안에서 익명함수를 바로 작성해도 된다. onClick={function(){}} 
  onClick={function(){}} 이걸 축약해서 화살표 함수로도 작성 가능하다.
  onClick={()=>{console.log(1)}}
  아무튼 ()=>{} 이것도 함수만드는 문법임
  */

  let [따봉,따봉변경용] = useState(0);


  return (
    <div className="App">                    
      <div className="black-nav">
        <h4 style={{color:'white',fontSize:'18px'}}>blog</h4> 
  
      </div>

      <div className="list">
        <h4>{포스팅[0]}<span onClick={()=>{따봉변경용(따봉+1)}}>&nbsp;&nbsp;👍🏻</span>{따봉}</h4>            
        <p>작성일 : 2024-11-20 </p>
      </div>

      <div className="list">
        
        {/* <h4>{포스팅[1]}&nbsp;&nbsp;<button onClick={()=>{a(['행궁동 카페','여행지 추천안함','빵지순례'])}}>버튼</button></h4> */}
        
        <h4>{포스팅[1]}&nbsp;&nbsp;<button onClick={() => {
          const 새로운포스팅 = [...포스팅];
          새로운포스팅[1] = '여행지 추천안함';
          a(새로운포스팅);
        }}
        >버튼</button></h4>
        

      

          {/* 
          let copy = 포스팅;
          copy[0] = '여자코트 추천';
          
           */}

        <p>작성일 : 2024-11-18 </p>
      </div>

      <div className="list">
        <h4>{포스팅[2]}</h4>            
        <p>작성일 : 2024-11-10 </p>
      </div>

    </div>
  );
}

export default App;


 
 /*
  class(X) className
  style 넣을 땐 style={{스타일명:'값'}}
  속성 적을때 font-size(x) 카멜법으로 작성
  변수는 중괄호로 감싸서 사용, 데이터바인딩은 중괄호

  return() 안에는 병렬로 태그 2개 이상 기입 금지 (딱 하나만!)


  state 만드는 법
  1. import{useState}
  2. useState(보관할 자료)
  3. let[작명,작명]


  let num = [1,3];
  let [a,c] = [1,3];
  이렇게 형태를 맞춰주면 a는 1, c는 3이 된다.


  자주 변경될 것 같은 html 부분은 state로 미리 만들어놓기
  변경하지 않는 내용은 useState를 굳이 사용할 필요 없음

 */