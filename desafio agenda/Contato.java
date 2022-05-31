class Contato {
  public static void upgradeContact(int index){
	char* name;
	int age;
	char cellnumber[16];
	char* adress;
	char* city;
	char state[2];
	
	char data[MAX];
	int op;

	printf("\tO que deseja atualizar?");
	printf("\n\t[1] - Nome\n"
	"\t[2] - Idade\n"
	"\t[3] - Celular\n"
	"\t[4] - Endereço\n"
	"\t[5] - Cidade\n"
	"\t[6] - Estado\n"
	"\t[7] - Tudo\n"
	"\t[0] - Voltar\n");
	printf("\n\tOpção escolhida: ");
	scanf("%i", &op);
	
	switch(op){
		case 1:

			printf("\n\t\tNome: ");
			scanf("%d", &op);
         setbuf(stdin, NULL);

			//Alocação e cópia de dados
			name = memoryAllocation(strlen(data));
			strcpy(name, data);
			contact[index].name = name;
			break;