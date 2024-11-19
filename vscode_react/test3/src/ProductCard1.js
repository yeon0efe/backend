
function ProductCard1({productName,price,description,inStock}){
    const cardStyle={
        backgroundColor :inStock ? 'rgba(30, 144, 255, 0.5)' : 'rgba(169, 169, 169, 0.5)',
        padding: '10px',
        margin: '10px',
        borderRadius: '5px'
    }

    return(
        <div style={cardStyle}>
            <h2>상품명 : {productName}</h2>
            <p>가격 : {price}</p>
            <p>설명 : {description}</p>
            <p>재고 : {inStock ? "여유":"품절"}</p>
        </div>
    );
}
// 기본값 설정
ProductCard1.defaultProps = {
    productName: "상품명 없음",
    price: "가격 정보 없음",
    description: "설명 없음",
    inStock: false
};


export default ProductCard1;