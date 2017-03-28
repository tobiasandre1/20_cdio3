package dataLayerInterfaces;

import java.util.List;

import dataTransferObject.ReceptKomponentDTO;

public interface IReceptKomponentDAO {
	ReceptKomponentDTO getReceptKomp(int receptId, int raavareId) throws DALException;
	List<ReceptKomponentDTO> getReceptKompList(int receptId) throws DALException;
	List<ReceptKomponentDTO> getReceptKompList() throws DALException;
		void createReceptKomp(ReceptKomponentDTO receptkomponent) throws DALException;
	void updateReceptKomp(ReceptKomponentDTO receptkomponent) throws DALException;
}
