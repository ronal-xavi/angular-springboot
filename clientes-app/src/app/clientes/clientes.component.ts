import { ClienteService } from './../service/cliente.service';
import { Cliente } from './../entity/cliente';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-clientes',
  templateUrl: './clientes.component.html',
  styleUrls: ['./clientes.component.css'],
})
export class ClientesComponent implements OnInit {

  clientes: Cliente[] = [];

  constructor(private clienteService: ClienteService) {
  }

  ngOnInit(): void {
    this.clientes = this.clienteService.listarClientes();
  }
}
