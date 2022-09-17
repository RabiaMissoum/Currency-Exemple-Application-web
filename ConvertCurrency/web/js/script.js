/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

fetch(' https://www.tuhund.com/apidocs/lookup-common-lookup-api-in-tuhund-erplookupid=CURRENCY').then((data)=>{
   // console.log('data');
    return data.json();
}).then((completedata)=>{
    console.log(completedata[id].name);
    document.getElementById('CURRENCY').innerHTML=completedata[id].name;
})
