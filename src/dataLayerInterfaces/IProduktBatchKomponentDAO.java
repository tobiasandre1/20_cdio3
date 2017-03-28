package dataLayerInterfaces;

import java.util.List;

import dataTransferObject.ProduktBatchKomponentDTO;

public interface IProduktBatchKomponentDAO {
	ProduktBatchKomponentDTO getProduktBatchKomp(int pbId, int rbId) throws DALException;
	List<ProduktBatchKomponentDTO> getProduktBatchKompList(int pbId) throws DALException;
	List<ProduktBatchKomponentDTO> getProduktBatchKompList() throws DALException;
	void createProduktBatchKomp(ProduktBatchKomponentDTO produktbatchkomponent) throws DALException;
	void updateProduktBatchKomp(ProduktBatchKomponentDTO produktbatchkomponent) throws DALException;	
}

