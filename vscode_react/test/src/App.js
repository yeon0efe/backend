import Hello from "./Hello";
import './App.css'
function App(){
  const name = 'react';
  const style1 = {
    backgroundColor:'black',
    color:'aqua',
    fontSize:24, //기본단위는 px가 자동으로...
    padding:'1rem' //기본단위가 아닌 경우에는 문자열

  }
  return(
    <>

    {/*주석은 이렇게 작성!*/}
    /*중괄호로 감싸지 않으면 화면에 보여요~ */

    <Hello
    //열리는 태그 내부에서는 주석 이렇게 작성 가능
    />
    <div style={style1}>{name}</div>
    <div className="lime-box"></div>
    </>
  );
}
export default App;