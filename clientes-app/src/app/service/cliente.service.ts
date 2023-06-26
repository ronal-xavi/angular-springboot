import { Injectable } from '@angular/core';
import { CLIENTES } from '../clientes/clientes.json';
import { Cliente } from '../entity/cliente';

@Injectable({
  providedIn: 'root'
})
export class ClienteService {

  clientes: Cliente[] = [];

  constructor() { }

  listarClientes(): Cliente[]{
    return CLIENTES;
  }

}
