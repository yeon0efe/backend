import UserCard from "./UserCard";

function UserList(){
    const users = [
        {name : "Alice", age:30, job:"Designer",  isActive:true},
        {name : "Bob", age:22, job:"Developer",  isActive:true},
        {name : "Charlie", age:27, job:"product Manager",  isActive:true},
        {name : "Dana", job:"Analyst",  isActive:false}//나이정보없음

    ];
    return(
        <div>
            <h1>사용자 목록</h1>
            {users.map((user,index) =>(
            <UserCard
                key={index}
                name={user.name}
                age={user.age}
                job={user.job}
                isActive={user.isActive}
            />
            ))}
        </div>
    );
}
export default UserList;