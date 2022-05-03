let usuarioUm = {
    nome: "Leandro de Souza Lima Almeida",
    idade: "36",
    filiacao: ['Américo Baptista de Almeida Júnior' , 'Romenilda de Souza Lima de Almeida'],
    endereco: { rua: "Rua da Gameleira", bairro: "Intermares", cidade: "Cabedelo" },

    dadosCompletos: function() {
        if(this.nome == String || this.idade == Number || this.filiacao == Array || this.endereco == Object)
            return false;
        return true;
    }
}    

let usuarioDois = {
    nome: "Thiago Lima de Almeida",
    idade: "32",
    filiacao: ['Américo Baptista de Almeida Júnior' , 'Romenilda de Souza Lima de Almeida'],
    endereco: { rua: "Rua Farah Jorge Farah", bairro: "Tambauzinho", cidade: "João Pessoa" },

    dadosCompletos: function() {
        if (this.nome == String || this.idade == Number || this.filiacao == Array || this.endereco == Object)
            return false;
        return true;
    }
}

function resultado(usuarioUm, usuarioDois) {
    console.log(usuarioUm.dadosCompletos())
    console.log(usuarioDois.dadosCompletos())
}