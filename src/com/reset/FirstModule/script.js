// VARIÁVEIS

//Exercício

let nomeCompleto = "Alan"
let apelido = 'cide'
let idade = 28
let dataNascimento = "24/05/93"
let localNascimento = "Guaraciaba, SC"
let altura = "1,85"
let trabalhando = false

apresentacao = "Meu nome é " + nomeCompleto + " (sou conhecido[a] como " + apelido + ") e tenho " +
 idade + " anos. Nasci no dia " + dataNascimento + ", na cidade de " + localNascimento +
  ". Tenho " + altura + "m de altura e atualmente estou " +
   (trabalhando ? "empregado" : "desempregado") + "."

console.log(apresentacao)

// TIPOS DE VARIÁVEL

// *string*
   alto = 'alto'

// inteiro
   a = 300

// real(float)
   b = 3.5

// booleano
   c = false

// OPERADORES

// Adição
   d = a + b
   console.log(d)

// Adição incremental
   e = 0
   e++
   console.log(e)
   e = 0
   ++e
   console.log(e) // Importate: '++' à frente da variável tem resultado diferente.

// Subtração
   d = a - b
   console.log(d)

// Divisão
   d = a / b
   console.log(d)

// Divisão por módulo
   d = a % b
   console.log(d)

// Multiplicação
   d = a*b
   console.log(d)

//Potenciação
   d = 3**2
   console.log(d)


// COMPARAÇÕES

// Igual à
   f = (a == b)
   console.log(f)

// Diferente de
   t = (a != b)
   console.log(t)

// Maior que
   console.log(a > b)

// Menor que
   console.log(a < b)

// Maior ou igual a 
   console.log(a >= b)

// Menor ou igual a
   console.log(a <= b)

// booleanas
   tony = false
   blair = true

// AND
   console.log(tony && blair)

// OR
   console.log(tony || blair)

// NOT
   console.log(!tony)

// mixing
   console.log(!tony && blair)

// Exercício
nomeDoFulano = "Fulano"
nomeDoBeltrano = "Beltrano"
mesmoNome = nomeDoFulano == nomeDoBeltrano
console.log(mesmoNome)

idade = 18
maiorDeIdade = idade>=18
console.log(maiorDeIdade)

boleto = 100 
juros = boleto * 0.1
valorComJuros = boleto + juros
console.log(maiorDeIdade)

item1 = 1 
item2 = 2 
item3 = 3
item4 = 4 
item5 = 5
media = (item1+item2+item3+item4+item5) / 5
console.log(media)

net_revenue = 80
prod_cost = 20
gross_profit = net_revenue - prod_cost

gross_margin = (gross_profit/net_revenue)
console.log("Margem bruta de", gross_margin, "%")

net = 1000
net = net - 99.9
net = net + 2500
net = net - .1
net = net - (net*.25)
net = net/2
console.log(net)

// CONDICIONAIS

peso = 95
altura = 1.85

imc = peso/altura**2
console.log("Seu IMC é", imc, "que representa:")

if (imc < 18.5){
   console.log("Magreza")
}
else if (imc>=18.5 && imc<=24.99){
   console.log("Normal")
}
else if (imc>=25 && imc<=29.99){
   console.log("Sobrepeso")
   console.log("Grau de Obesidade: 1")
}
else if (imc>=30 && imc<=39.99){
   console.log("Obesidade")
   console.log("Grau de Obesidade: 2")
}
else if (imc>= 40){
   console.log("Obesidade Grave")
   console.log("Grau de Obesidade: 3")
}

// ARRAYs
   // Declarando arrays
   ar = [1, 23, 56]
   ray = []
   ray[0] = "Bolo" //item 0, o primeiro do array, recebe a string "Bolo"
   v = [Date.now] //arrays podem receber funções, pois é um tipo especial de objetos

   // Métodos de array
   console.log(ar.length)
   console.log(ar.sort())

   // Iterando arrays
   frutas = ["Banana", "Laranja", "Maça", "Manga"]
   
   for (i = 0; i < frutas.length; i++){
      console.log(frutas[i])
   }

   // Acrescentando elementos em array
   frutas.push("Limão")
   console.log(frutas)

   // Arrays de arrays
   vetor0 = [1,2,3]
   vetor1 = ["Cassandra", "Violeta", "Sol"]
   vetor0.push(vetor1)
   console.log(vetor0)

// REPETIÇÕES
   
   // While
   x = 0
   while (x < 10){ // enquanto condição verdadeira, faça tal coisa
      console.log(x)
      x++
   }

   //Do... While
   y=10
   do { //Faça tal coisa, enquanto condição for verdadeira
      console.log(y--)
   }while(y>0)

   // for
   for (z=100;z<110;z++){ //for(início; até fim; variando assim)
      console.log(z)
   }

// Exercícios
array = [1, 2, 3, 5, 8, 13, 21, 23, 34, 55]
sum = 0
for (i=0; i<array.length;i++){
   sum=sum+array[i]
}
console.log("Média calculada:",(sum/array.length))

nomesComuns = ["Miguel", "Laura", "Lucas", "Beatriz", "Guilherme", "Maria", "Gabriel", "Ana", "Arthur", "Júlia", 
"Enzo", "Alice", "Rafael", "Mariana", "João", "Larissa", "Gustavo", "Maria Eduarda", "Pedro", "Sofia", 
"Bernardo", "Isabela", "Matheus", "Helena", "Davi", "Camila", "Heitor", "Lara", "Henrique", "Valentina", 
"Bruno", "Letícia", "Samuel", "Luana", "Felipe", "Amanda", "Lorenzo", "Yasmin", "Benjamin", "Sophia", 
"Vinícius", "Rebeca", "Rodrigo", "Juliana", "Eduardo", "Bruna", "Diego", "Cecília", "Antônio", "Fernanda", 
"Leonardo", "Isadora", "Noah", "Lorena", "Nícolas", "Lívia", "Daniel", "Manuela", "Thiago", "Vitória"]

myName = "Alan"

for(i=0;i<nomesComuns.length;i++){
   if (myName == nomesComuns[i]){
      console.log("É, nome comum :P")
      console.log(i)
      break
   }
   else if (i==(nomesComuns.length-1)){
      console.log("Diferentão, hein? XD")
   }
}

//FUNÇÕES
   //Exercícios

function imprimir(s){
   /*
   input: any
   output: string
   */
   console.log(String(s))
}

function mesmoNome1(nome1, nome2){
   /*
   input: string
   output: boolean
   */
   if(String(nome1)==String(nome2)){
      return true ;
   }
   else{
      return false;
   }
}

function maiorDeIdade1(i){
   /*
   input: int
   output: boolean
   */
   if(i>=18){
      return true;
   }
   else{
      return false;
   }
}

function valorComJuros1(principal, juros=10){
   /*
   input: int
   output: float
   */
   sum = principal+ (principal*(juros/100));
   return sum;
}

function mediaAritmetica(arr){
   /*
   input: array
   output: float
   */
   soma = 0
   for(i=0;i<arr.length;i++){
      soma = soma+arr[i]
   }
   console.log(soma/arr.length)
}

function margemBruta(net_revenue, prod_cost){
   /*
   input: float
   output: float
   */
   gross_profit = net_revenue - prod_cost

   gross_margin = (gross_profit/net_revenue)
   console.log("Margem bruta de", gross_margin*100, "%")
}

cwi = "CWI"
reset = "Reset"
imprimir(mesmoNome1(cwi, cwi))   // true
imprimir(mesmoNome1(cwi, reset)) // false

imprimir("---")

imprimir(maiorDeIdade1(30)) // true
imprimir(maiorDeIdade1(18)) // true
imprimir(maiorDeIdade1(5))  // false

imprimir("---")

imprimir(valorComJuros1(100))   // 110
imprimir(valorComJuros1(984.5)) // 1082.95

imprimir("---")

imprimir(mediaAritmetica([1]))             // 1
imprimir(mediaAritmetica([1, 4, 10]))      // 5
imprimir(mediaAritmetica([1, 2, 3, 4, 5])) // 3

imprimir("---")

imprimir(margemBruta(1000000, 500000))      // 50
imprimir(margemBruta(528459.11, 632501.87)) // -19.68[...]


// Exercício fim de módulo

colaboradores    = ['Rhoger', 'Cléverson', 'Gleysberto', 'Nádio', 'Rosiméri', 'Regislane', 'Agripino', 'Wellison']
idades           = [      69,          66,           58,      61,         60,          64,         59,         55]
temposDeTrabalho = [      31,          29,           30,      26,         25,          24,         26,         29]



function retrive(name){
   datum=[]
   for(i=0; i<colaboradores.length;i++)
      if (colaboradores[i] == name){
         datum[0]=idades[i]
         datum[1]=temposDeTrabalho[i]
         return datum
      }
   return false
}

function check_retirement(name){
   if (retrive(name) == false){
      console.log("Colaborador inválido :|")
      return
   }
   else{
      colab = retrive(name)
   }
   if((colab[0] >= 60 && colab[1] >= 25) || colab[0] >= 65 || colab[1] >= 30){
      console.log("Parabéns, já pode sair de férias eternas :)")
   }
   else{
      console.log("Infelizmente para você, ainda falta um tempo :(")
   }
}