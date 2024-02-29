const axios = require ('axios');

const comprar = async (req,res) => {
    const {tipo, usuario} = req.body;
    const response =  await axios.post('http://localhost:3331/ticket/comprar', {
        tipo,
        usuario
    });
    return res.status(response.status).json(response.data);
};

const consumir = async (req,res) => {
    const response =  await axios.post('http://localhost:3331/ticket/consumir',req.body);
    return res.status(response.status).json(response.data);
};

const listar = async (req,res) => {
    const response = await axios.get('http://localhost:3331/ticket/listar');
    return res.status(response.status).json(response.data);

}

module.exports = {
    comprar,
    consumir,
    listar
};