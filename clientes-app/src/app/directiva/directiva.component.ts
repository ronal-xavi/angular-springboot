import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-directiva',
  templateUrl: './directiva.component.html',
  styleUrls: ['./directiva.component.css'],
})
export class DirectivaComponent {
  listarCurso: string[] = [
    'TypeScript',
    'Java Script',
    'Java SE',
    'C#',
    'PHP',
  ];

  habilitar: boolean = true;
  mensajeBotton: string ="Ocultar";

  constructor() {}

  sethabilitar(): void{
    this.habilitar = this.habilitar?false:true
    this.mensajeBotton = this.habilitar?"Ocultar": "Mostrar";

  }



}
